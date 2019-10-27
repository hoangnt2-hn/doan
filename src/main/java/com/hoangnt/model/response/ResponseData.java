package com.hoangnt.model.response;

public class ResponseData<T> {
	T accountInfo;
	T address;
	String idToken;

	public T getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(T accountInfo) {
		this.accountInfo = accountInfo;
	}
	public String getIdToken() {
		return idToken;
	}
	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}
	public T getAddress() {
		return address;
	}
	public void setAddress(T address) {
		this.address = address;
	}

}
