.class public Lcom/join/mgps/dto/TipsInfoBean;
.super Ljava/lang/Object;
.source "TipsInfoBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private display_switch:Ljava/lang/Boolean;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDisplay_switch()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/TipsInfoBean;->display_switch:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/TipsInfoBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setDisplay_switch(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/TipsInfoBean;->display_switch:Ljava/lang/Boolean;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/TipsInfoBean;->title:Ljava/lang/String;

    return-void
.end method
