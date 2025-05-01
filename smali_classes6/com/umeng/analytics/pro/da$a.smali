.class public Lcom/umeng/analytics/pro/da$a;
.super Ljava/lang/Object;
.source "TTupleProtocol.java"

# interfaces
.implements Lcom/umeng/analytics/pro/cw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/da;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/di;)Lcom/umeng/analytics/pro/cu;
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/da;

    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/da;-><init>(Lcom/umeng/analytics/pro/di;)V

    return-object v0
.end method
