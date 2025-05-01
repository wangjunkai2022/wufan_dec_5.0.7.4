.class public final Lcom/kwad/sdk/crash/report/upload/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public aHt:Ljava/lang/String;

.field public aIT:Ljava/lang/String;

.field public aIU:Ljava/lang/String;

.field public aIV:Ljava/lang/String;

.field public aIW:Ljava/lang/String;

.field public aIX:Ljava/lang/String;

.field public aIY:Ljava/lang/String;

.field public aIZ:Ljava/lang/String;

.field public aJa:Ljava/lang/String;

.field public aJb:Ljava/io/File;

.field public mTaskId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "kwad.sdk"

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/crash/report/upload/f;->aIU:Ljava/lang/String;

    const-string v0, "Android"

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/crash/report/upload/f;->aIX:Ljava/lang/String;

    return-void
.end method
