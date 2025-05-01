.class public final Lcom/join/mgps/va/overmind/PaCtrl;
.super Ljava/lang/Object;
.source "PaCtrl.kt"


# static fields
.field public static final a:Lcom/join/mgps/va/overmind/PaCtrl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/mgps/va/overmind/PaCtrl;

    invoke-direct {v0}, Lcom/join/mgps/va/overmind/PaCtrl;-><init>()V

    sput-object v0, Lcom/join/mgps/va/overmind/PaCtrl;->a:Lcom/join/mgps/va/overmind/PaCtrl;

    const-string v0, "pactrl"

    .line 1
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native mountLibGggg(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final native onSoLoaded(Ljava/lang/String;J)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
