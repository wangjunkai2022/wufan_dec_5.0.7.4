.class public final Lcom/kwad/sdk/crash/report/upload/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static aII:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIJ:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIK:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIL:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIM:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIN:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIO:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIP:Lcom/kwad/sdk/crash/report/upload/e;

.field public static aIQ:Lcom/kwad/sdk/crash/report/upload/e;


# instance fields
.field private final aIR:I

.field private final aIS:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0xb

    const-string v2, "Please init."

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aII:Lcom/kwad/sdk/crash/report/upload/e;

    .line 2
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0xc

    const-string v2, "error when zip_file"

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIJ:Lcom/kwad/sdk/crash/report/upload/e;

    .line 3
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0xd

    const-string v2, "There is no valid network."

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIK:Lcom/kwad/sdk/crash/report/upload/e;

    .line 4
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0xe

    const-string v2, "Token is invalid."

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIL:Lcom/kwad/sdk/crash/report/upload/e;

    .line 5
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0xf

    const-string v2, "upload task execute frequence exceed."

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIM:Lcom/kwad/sdk/crash/report/upload/e;

    .line 6
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0x10

    const-string v2, "process request fail."

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIN:Lcom/kwad/sdk/crash/report/upload/e;

    .line 7
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0x11

    const-string v2, "sever response error http code"

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIO:Lcom/kwad/sdk/crash/report/upload/e;

    .line 8
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0x12

    const-string v2, "sever response error result code"

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIP:Lcom/kwad/sdk/crash/report/upload/e;

    .line 9
    new-instance v0, Lcom/kwad/sdk/crash/report/upload/e;

    const/16 v1, -0x13

    const-string v2, "server bad response."

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/crash/report/upload/e;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/sdk/crash/report/upload/e;->aIQ:Lcom/kwad/sdk/crash/report/upload/e;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/kwad/sdk/crash/report/upload/e;->aIR:I

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/crash/report/upload/e;->aIS:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final wR()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/report/upload/e;->aIS:Ljava/lang/String;

    return-object v0
.end method
