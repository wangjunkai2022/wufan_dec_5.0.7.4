.class public Lb3/a;
.super Ljava/lang/Object;
.source "BeanUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/join/mgps/dto/AccountBean;)Lcom/wufan/user/service/protobuf/n0;
    .locals 4

    .line 1
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->f5()Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->p4(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->F3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0$b;->O1()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->e4(J)Lcom/wufan/user/service/protobuf/n0$b;

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getRegisterTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->i4(J)Lcom/wufan/user/service/protobuf/n0$b;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getAvatarSrc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->K3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getExp()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getExp()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->M3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->V3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getSurplusExp()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getSurplusExp()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->m4(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->c4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getMobile()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->a4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getPay_top_tip()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->f4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getGender()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->P3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->n4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getPwd_set_up()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->h4(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getAccount_type()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->H3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getVip_level()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->s4(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getSvip_level()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->s4(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getVip_exp_time()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->q4(J)Lcom/wufan/user/service/protobuf/n0$b;

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getLive_total_charm()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->W3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getIs_anchor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->Q3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getMember_title()Lcom/join/mgps/dto/AccountBean$MemberInfo;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 25
    invoke-static {}, Lcom/wufan/user/service/protobuf/h;->g3()Lcom/wufan/user/service/protobuf/h$b;

    move-result-object v1

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getMember_title()Lcom/join/mgps/dto/AccountBean$MemberInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AccountBean$MemberInfo;->getBattleTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/wufan/user/service/protobuf/h$b;->X2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/h$b;

    .line 27
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getLevel()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/wufan/user/service/protobuf/h$b;->b3(I)Lcom/wufan/user/service/protobuf/h$b;

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getMember_title()Lcom/join/mgps/dto/AccountBean$MemberInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/AccountBean$MemberInfo;->getBattleTitleColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/wufan/user/service/protobuf/h$b;->Z2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/h$b;

    .line 29
    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->Y3(Lcom/wufan/user/service/protobuf/h$b;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 30
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getIs_real_name()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->U3(I)Lcom/wufan/user/service/protobuf/n0$b;

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getSecretKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getSecretKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->k4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    goto :goto_0

    .line 33
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getUid()I

    move-result v1

    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getVip_level()I

    move-result v3

    invoke-static {v1, v2, v3}, Lb3/a;->b(ILjava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->k4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 34
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/dto/AccountBean;->getMember_time()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/wufan/user/service/protobuf/n0$b;->X3(J)Lcom/wufan/user/service/protobuf/n0$b;

    .line 35
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/wufan/user/service/protobuf/n0;

    return-object p0
.end method

.method private static b(ILjava/lang/String;I)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "uid"

    .line 3
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p0, "token"

    .line 4
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "t"

    .line 5
    invoke-virtual {v0, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/join/mgps/Util/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const-string p0, ""

    return-object p0
.end method
