package com.company.boot003.board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @ToString @NoArgsConstructor
public class PagingDto {
	private int listtotal;		// 전체글 121
	private int onepagelist;	// 한 페이지에 보여줄 게시물 수 10
	private int pagetotal;		// 총 페이지 수 13페이지
	private int bottomlist;		// 하단 페이지 나누기 
	
	private int pstartno;		// 페이지의 시작 번호
	
	private int current;		// 현재 페이지 번호
	private int start;			// 시작 페이지 번호
	private int end;			// 끝 페이지 번호
	
	public PagingDto(int listtotal, int pstartno) {
		super();
		this.listtotal = listtotal;
		this.pstartno = pstartno*10;
		this.onepagelist = 10;
		
		if (this.listtotal<=0) {this.listtotal=1;}
		this.pagetotal = (int) Math.ceil(listtotal/(double)onepagelist);
		
		this.bottomlist=10;
		
		
		this.current = (this.pstartno/this.onepagelist) +1;
		this.start = ((this.current-1)/this.bottomlist)*this.bottomlist+1;
		this.end = this.start + this.bottomlist -1;
		
		if(this.pagetotal<this.end) { this.end=this.pagetotal;}
	}
}
