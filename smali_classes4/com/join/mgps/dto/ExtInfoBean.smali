.class public Lcom/join/mgps/dto/ExtInfoBean;
.super Ljava/lang/Object;
.source "ExtInfoBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private faq_url:Ljava/lang/String;

.field private game_cfg:Lcom/join/mgps/dto/GameCfgBean;

.field private help_des:Ljava/lang/String;

.field private help_url:Ljava/lang/String;

.field private share_info:Lcom/join/mgps/dto/ShareInfoBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFaq_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtInfoBean;->faq_url:Ljava/lang/String;

    return-object v0
.end method

.method public getGame_cfg()Lcom/join/mgps/dto/GameCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtInfoBean;->game_cfg:Lcom/join/mgps/dto/GameCfgBean;

    return-object v0
.end method

.method public getHelp_des()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtInfoBean;->help_des:Ljava/lang/String;

    return-object v0
.end method

.method public getHelp_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtInfoBean;->help_url:Ljava/lang/String;

    return-object v0
.end method

.method public getShare_info()Lcom/join/mgps/dto/ShareInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtInfoBean;->share_info:Lcom/join/mgps/dto/ShareInfoBean;

    return-object v0
.end method

.method public setFaq_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtInfoBean;->faq_url:Ljava/lang/String;

    return-void
.end method

.method public setGame_cfg(Lcom/join/mgps/dto/GameCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtInfoBean;->game_cfg:Lcom/join/mgps/dto/GameCfgBean;

    return-void
.end method

.method public setHelp_des(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtInfoBean;->help_des:Ljava/lang/String;

    return-void
.end method

.method public setHelp_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtInfoBean;->help_url:Ljava/lang/String;

    return-void
.end method

.method public setShare_info(Lcom/join/mgps/dto/ShareInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtInfoBean;->share_info:Lcom/join/mgps/dto/ShareInfoBean;

    return-void
.end method
