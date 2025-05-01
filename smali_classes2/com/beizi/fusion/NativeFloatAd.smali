.class public Lcom/beizi/fusion/NativeFloatAd;
.super Ljava/lang/Object;
.source "NativeFloatAd.java"


# instance fields
.field private a:Lcom/beizi/fusion/d/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/NativeFloatAdListener;)V
    .locals 7
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v6, Lcom/beizi/fusion/d/p;

    const-wide/16 v4, 0x2710

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/beizi/fusion/d/p;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    iput-object v6, p0, Lcom/beizi/fusion/NativeFloatAd;->a:Lcom/beizi/fusion/d/p;

    const/4 p1, 0x0

    .line 3
    invoke-virtual {v6, p1}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/NativeFloatAdListener;J)V
    .locals 7
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v6, Lcom/beizi/fusion/d/p;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/beizi/fusion/d/p;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    iput-object v6, p0, Lcom/beizi/fusion/NativeFloatAd;->a:Lcom/beizi/fusion/d/p;

    const/4 p1, 0x0

    .line 6
    invoke-virtual {v6, p1}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/NativeFloatAd;->a:Lcom/beizi/fusion/d/p;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->m()V

    :cond_0
    return-void
.end method
