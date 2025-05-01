.class public Lo2/a$a;
.super Ljava/lang/Object;
.source "KeyBoardUtils.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/a$a$a;
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/String; = "ListenerHandler"


# instance fields
.field private b:Landroid/view/View;

.field private c:I

.field private d:I

.field private e:Lo2/a$a$a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lo2/a$a;->c(Landroid/app/Activity;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lo2/a$a;->b:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 3
    invoke-direct {p0}, Lo2/a$a;->a()V

    :cond_1
    return-void
.end method

.method private a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo2/a$a;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private c(Landroid/app/Activity;)Landroid/view/View;
    .locals 1

    const v0, 0x1020002

    .line 1
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/a$a;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method

.method public d(Lo2/a$a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo2/a$a;->e:Lo2/a$a$a;

    return-void
.end method

.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo2/a$a;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lo2/a$a;->d:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    .line 3
    iput v0, p0, Lo2/a$a;->d:I

    .line 4
    iput v0, p0, Lo2/a$a;->c:I

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    if-eq v1, v0, :cond_1

    .line 5
    iput v0, p0, Lo2/a$a;->d:I

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_4

    .line 6
    iget v1, p0, Lo2/a$a;->c:I

    if-ne v1, v0, :cond_3

    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    sub-int v3, v1, v0

    .line 7
    :goto_1
    iget-object v0, p0, Lo2/a$a;->e:Lo2/a$a$a;

    if-eqz v0, :cond_4

    .line 8
    invoke-interface {v0, v2, v3}, Lo2/a$a$a;->a(ZI)V

    :cond_4
    return-void
.end method
