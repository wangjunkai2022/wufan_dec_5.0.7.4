.class public Lcom/join/android/app/common/utils/h$a;
.super Ljava/lang/Object;
.source "DimenDPThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/android/app/common/utils/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/android/app/common/utils/h$a;->a:I

    .line 3
    iput p2, p0, Lcom/join/android/app/common/utils/h$a;->b:I

    return-void
.end method

.method static synthetic a(Lcom/join/android/app/common/utils/h$a;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/android/app/common/utils/h$a;->c()I

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/join/android/app/common/utils/h$a;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/android/app/common/utils/h$a;->d()I

    move-result p0

    return p0
.end method

.method private c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/android/app/common/utils/h$a;->a:I

    return v0
.end method

.method private d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/android/app/common/utils/h$a;->b:I

    return v0
.end method
