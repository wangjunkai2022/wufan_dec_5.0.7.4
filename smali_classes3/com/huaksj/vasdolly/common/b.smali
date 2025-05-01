.class public Lcom/huaksj/vasdolly/common/b;
.super Ljava/lang/Object;
.source "ChannelConstants.java"


# static fields
.field public static final a:I = 0x71777766

.field public static final b:Ljava/lang/String; = "UTF-8"

.field static final c:I = 0x2

.field public static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lcom/huaksj/vasdolly/common/b;->d:[B

    return-void

    :array_0
    .array-data 1
        0x6ct
        0x7at
        0x6ct
        0x6ft
        0x76t
        0x65t
        0x6at
        0x68t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
