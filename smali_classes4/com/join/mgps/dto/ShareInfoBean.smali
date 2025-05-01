.class public Lcom/join/mgps/dto/ShareInfoBean;
.super Ljava/lang/Object;
.source "ShareInfoBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private description:Ljava/lang/String;

.field private head_url:Ljava/lang/String;

.field private uid:Ljava/lang/Integer;

.field private user_name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ShareInfoBean;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getHead_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ShareInfoBean;->head_url:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ShareInfoBean;->uid:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUser_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ShareInfoBean;->user_name:Ljava/lang/String;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ShareInfoBean;->description:Ljava/lang/String;

    return-void
.end method

.method public setHead_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ShareInfoBean;->head_url:Ljava/lang/String;

    return-void
.end method

.method public setUid(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ShareInfoBean;->uid:Ljava/lang/Integer;

    return-void
.end method

.method public setUser_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ShareInfoBean;->user_name:Ljava/lang/String;

    return-void
.end method
