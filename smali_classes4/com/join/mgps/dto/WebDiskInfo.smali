.class public Lcom/join/mgps/dto/WebDiskInfo;
.super Ljava/lang/Object;
.source "WebDiskInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private gameId:Ljava/lang/String;

.field private wb_file_date:Ljava/lang/String;

.field private wb_file_size:Ljava/lang/String;

.field private wb_switch:I

.field private wb_url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskInfo;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public getWb_file_date()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_file_date:Ljava/lang/String;

    return-object v0
.end method

.method public getWb_file_size()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_file_size:Ljava/lang/String;

    return-object v0
.end method

.method public getWb_switch()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_switch:I

    return v0
.end method

.method public getWb_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_url:Ljava/lang/String;

    return-object v0
.end method

.method public setGameId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskInfo;->gameId:Ljava/lang/String;

    return-void
.end method

.method public setWb_file_date(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_file_date:Ljava/lang/String;

    return-void
.end method

.method public setWb_file_size(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_file_size:Ljava/lang/String;

    return-void
.end method

.method public setWb_switch(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_switch:I

    return-void
.end method

.method public setWb_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskInfo;->wb_url:Ljava/lang/String;

    return-void
.end method
