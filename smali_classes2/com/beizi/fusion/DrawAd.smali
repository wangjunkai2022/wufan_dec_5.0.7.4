.class public Lcom/beizi/fusion/DrawAd;
.super Ljava/lang/Object;
.source "DrawAd.java"


# instance fields
.field private a:Lcom/beizi/fusion/d/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/DrawAdListener;J)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v6, Lcom/beizi/fusion/d/i;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/beizi/fusion/d/i;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    iput-object v6, p0, Lcom/beizi/fusion/DrawAd;->a:Lcom/beizi/fusion/d/i;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/DrawAd;->a:Lcom/beizi/fusion/d/i;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/i;->c()V

    :cond_0
    return-void
.end method

.method public loadAd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/DrawAd;->a:Lcom/beizi/fusion/d/i;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/i;->b()V

    :cond_0
    return-void
.end method
