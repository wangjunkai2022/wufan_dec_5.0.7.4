.class public final Lcom/beizi/fusion/sm/a/a;
.super Ljava/lang/Object;
.source "DeviceID.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/sm/a/a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Application;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/sm/a/a$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/sm/a/a;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Application;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    sget-object v0, Lcom/beizi/fusion/sm/a/a$a;->a:Lcom/beizi/fusion/sm/a/a;

    .line 2
    iput-object p0, v0, Lcom/beizi/fusion/sm/a/a;->a:Landroid/app/Application;

    .line 3
    invoke-static {p0, v0}, Lcom/beizi/fusion/sm/a/a;->a(Landroid/content/Context;Lcom/beizi/fusion/sm/a/c;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/beizi/fusion/sm/a/c;)V
    .locals 0

    .line 4
    invoke-static {p0}, Lcom/beizi/fusion/sm/a/a/l;->a(Landroid/content/Context;)Lcom/beizi/fusion/sm/a/d;

    move-result-object p0

    invoke-interface {p0, p1}, Lcom/beizi/fusion/sm/a/d;->a(Lcom/beizi/fusion/sm/a/c;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 0

    .line 5
    invoke-static {p0}, Lcom/beizi/fusion/sm/a/a/l;->a(Landroid/content/Context;)Lcom/beizi/fusion/sm/a/d;

    move-result-object p0

    invoke-interface {p0}, Lcom/beizi/fusion/sm/a/d;->a()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    new-instance p1, Lcom/beizi/fusion/sm/a/e;

    const-string v0, "OAID is empty"

    invoke-direct {p1, v0}, Lcom/beizi/fusion/sm/a/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/beizi/fusion/sm/a/a;->a(Ljava/lang/Exception;)V

    return-void

    .line 8
    :cond_0
    iput-object p1, p0, Lcom/beizi/fusion/sm/a/a;->b:Ljava/lang/String;

    return-void
.end method
