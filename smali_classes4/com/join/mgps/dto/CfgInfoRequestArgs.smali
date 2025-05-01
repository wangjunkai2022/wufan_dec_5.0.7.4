.class public Lcom/join/mgps/dto/CfgInfoRequestArgs;
.super Ljava/lang/Object;
.source "CfgInfoRequestArgs.java"


# instance fields
.field private uid:I

.field private unknown_source_cfg:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getUid()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CfgInfoRequestArgs;->uid:I

    return v0
.end method

.method public getUnknown_source_cfg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CfgInfoRequestArgs;->unknown_source_cfg:Ljava/lang/String;

    return-object v0
.end method

.method public setUid(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CfgInfoRequestArgs;->uid:I

    return-void
.end method

.method public setUnknown_source_cfg(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CfgInfoRequestArgs;->unknown_source_cfg:Ljava/lang/String;

    return-void
.end method
