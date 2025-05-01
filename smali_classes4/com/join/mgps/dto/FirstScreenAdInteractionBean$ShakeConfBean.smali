.class public Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;
.super Ljava/lang/Object;
.source "FirstScreenAdInteractionBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/FirstScreenAdInteractionBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShakeConfBean"
.end annotation


# instance fields
.field private acceleration:I

.field private duration:I

.field private rotation_angle:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAcceleration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->acceleration:I

    return v0
.end method

.method public getDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->duration:I

    return v0
.end method

.method public getRotation_angle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->rotation_angle:I

    return v0
.end method

.method public setAcceleration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->acceleration:I

    return-void
.end method

.method public setDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->duration:I

    return-void
.end method

.method public setRotation_angle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->rotation_angle:I

    return-void
.end method
