package com.join.mgps.dto;

import com.kuaishou.weapon.p0.t;
import org.springframework.util.LinkedMultiValueMap;
/* loaded from: classes4.dex */
public class CommentSelfRequestBean extends CommentRequest {
    private String game_id;
    private int pc;
    private int pn;

    public String getGame_id() {
        return this.game_id;
    }

    @Override // com.join.mgps.dto.CommentRequest
    public LinkedMultiValueMap<String, String> getParams() {
        LinkedMultiValueMap<String, String> params = super.getParams();
        params.add("game_id", this.game_id + "");
        params.add("pn", this.pn + "");
        params.add(t.f55705x, this.pc + "");
        return params;
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    @Override // com.join.mgps.dto.CommentRequest
    public String toString() {
        return "CommentSelfRequestBean{game_id='" + this.game_id + "', pn=" + this.pn + ", pc=" + this.pc + '}';
    }
}
