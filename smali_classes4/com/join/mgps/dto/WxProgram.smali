.class public Lcom/join/mgps/dto/WxProgram;
.super Ljava/lang/Object;
.source "WxProgram.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private abuid:Ljava/lang/String;

.field private app_id:Ljava/lang/String;

.field private app_path:Ljava/lang/String;

.field private button_pic:Ljava/lang/String;

.field private button_text:Ljava/lang/String;

.field private code_text:Ljava/lang/String;

.field private code_url:Ljava/lang/String;

.field private extend:Ljava/lang/String;

.field private guide_text:Ljava/lang/String;

.field private is_join:I

.field private original_id:Ljava/lang/String;

.field private sceneType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "0"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/dto/WxProgram;->abuid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAbuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->abuid:Ljava/lang/String;

    return-object v0
.end method

.method public getApp_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->app_id:Ljava/lang/String;

    return-object v0
.end method

.method public getApp_path()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->app_path:Ljava/lang/String;

    return-object v0
.end method

.method public getButton_pic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->button_pic:Ljava/lang/String;

    return-object v0
.end method

.method public getButton_text()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->button_text:Ljava/lang/String;

    return-object v0
.end method

.method public getCode_text()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->code_text:Ljava/lang/String;

    return-object v0
.end method

.method public getCode_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->code_url:Ljava/lang/String;

    return-object v0
.end method

.method public getExtend()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->extend:Ljava/lang/String;

    return-object v0
.end method

.method public getGuide_text()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->guide_text:Ljava/lang/String;

    return-object v0
.end method

.method public getIs_join()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/WxProgram;->is_join:I

    return v0
.end method

.method public getOriginal_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->original_id:Ljava/lang/String;

    return-object v0
.end method

.method public getSceneType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WxProgram;->sceneType:Ljava/lang/String;

    return-object v0
.end method

.method public setAbuid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->abuid:Ljava/lang/String;

    return-void
.end method

.method public setApp_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->app_id:Ljava/lang/String;

    return-void
.end method

.method public setApp_path(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->app_path:Ljava/lang/String;

    return-void
.end method

.method public setButton_pic(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->button_pic:Ljava/lang/String;

    return-void
.end method

.method public setButton_text(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->button_text:Ljava/lang/String;

    return-void
.end method

.method public setCode_text(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->code_text:Ljava/lang/String;

    return-void
.end method

.method public setCode_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->code_url:Ljava/lang/String;

    return-void
.end method

.method public setExtend(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->extend:Ljava/lang/String;

    return-void
.end method

.method public setGuide_text(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->guide_text:Ljava/lang/String;

    return-void
.end method

.method public setIs_join(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/WxProgram;->is_join:I

    return-void
.end method

.method public setOriginal_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->original_id:Ljava/lang/String;

    return-void
.end method

.method public setSceneType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WxProgram;->sceneType:Ljava/lang/String;

    return-void
.end method
