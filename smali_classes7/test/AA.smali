.class public final Ltest/AA;
.super Ljava/lang/Object;
.source "AA.kt"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    new-instance v0, Ltest/AA$Test$1;

    invoke-direct {v0, p0}, Ltest/AA$Test$1;-><init>(Ltest/AA;)V

    const-string v1, "111"

    invoke-static {v1, v0}, Ltest/a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final b(I)V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method
