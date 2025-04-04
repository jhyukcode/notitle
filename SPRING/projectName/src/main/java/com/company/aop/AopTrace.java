package com.company.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopTrace {
	// Aspect = Adivce(�ΰ��������) + PointCut(�������)
	@Around("execution(public * com.company..*(..))")
	public Object trace( ProceedingJoinPoint joinPoint ) throws Throwable {
		// 1. target�� �޼�������
		String signature = joinPoint.getSignature().toShortString();
		System.out.println(">>> "+signature+" start!");
		// 2, ȣ��ð� Ȯ��
		long start = System.currentTimeMillis();
		// 3. target �޼��� ����
		Object result = joinPoint.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("..����ð� : "+(end-start)+"ms");
		System.out.println(">>> "+signature+" end!");
		return result;
	}
}


// execution( * hello(..) ) hello �޼���/ �Ķ���� ������ ��
// execution ( * hello() ) hello �޼��� / �Ķ���� X
// exectuion( * hello() ) hello�޼��� / �Ķ���� X
// execution ( public * com.company..*(..) ) ..������Ű������ ��� Ŭ����