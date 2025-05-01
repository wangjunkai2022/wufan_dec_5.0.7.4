package com.join.mgps.dto;

import androidx.annotation.NonNull;
import com.join.kotlin.base.net.BaseResponse;
import com.join.mgps.Util.g2;
/* loaded from: classes4.dex */
public class ResponseModel<E> extends BaseResponse<E> {
    private int code;
    private E data;
    private int error;
    private int flag;
    private String message;
    private String msg;
    private int page;
    private String version;

    public ResponseModel() {
    }

    public int getCode() {
        return this.code;
    }

    public E getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getPage() {
        return this.page;
    }

    @Override // com.join.kotlin.base.net.BaseResponse
    public int getResponseCode() {
        return this.code;
    }

    @Override // com.join.kotlin.base.net.BaseResponse
    public E getResponseData() {
        return this.data;
    }

    @Override // com.join.kotlin.base.net.BaseResponse
    @NonNull
    public String getResponseMsg() {
        return g2.h(this.msg) ? this.message : this.msg;
    }

    public String getVersion() {
        return this.version;
    }

    @Override // com.join.kotlin.base.net.BaseResponse
    public boolean isSuccess() {
        return this.code == 200;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setData(E e5) {
        this.data = e5;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public void setFlag(int i4) {
        this.flag = i4;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public ResponseModel(int i4, String str) {
        this.code = i4;
        this.flag = i4;
        this.message = str;
        this.msg = str;
    }

    public ResponseModel(int i4, int i5, String str) {
        this.code = i4;
        this.flag = i4;
        this.error = i5;
        this.message = str;
        this.msg = str;
    }
}
