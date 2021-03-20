package com.techlab.model;

public abstract class HomeSecurityChecker {
	private HomeSecurityChecker next;

	public void succeedWith(HomeSecurityChecker next) {
		this.next = next;
	}

	protected void callNext(HomeStatusDto dto) throws Exception {
		if (next != null) {
			next.check(dto);
		}

	}

	public abstract void check(HomeStatusDto dto) throws Exception;
}
