.class Lcom/beizi/fusion/g/w$a;
.super Ljava/lang/Object;
.source "EmulatorCheckUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/g/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/beizi/fusion/g/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/beizi/fusion/g/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/beizi/fusion/g/w;-><init>(Lcom/beizi/fusion/g/w$1;)V

    sput-object v0, Lcom/beizi/fusion/g/w$a;->a:Lcom/beizi/fusion/g/w;

    return-void
.end method

.method static synthetic a()Lcom/beizi/fusion/g/w;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/g/w$a;->a:Lcom/beizi/fusion/g/w;

    return-object v0
.end method
