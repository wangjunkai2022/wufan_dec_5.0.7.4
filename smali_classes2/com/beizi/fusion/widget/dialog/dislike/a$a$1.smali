.class Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;
.super Ljava/lang/Object;
.source "DislikeDialog.java"

# interfaces
.implements Lcom/beizi/fusion/widget/dialog/dislike/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a$a;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/dialog/dislike/a$a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$a;

    invoke-static {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)Lcom/beizi/fusion/widget/dialog/dislike/a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$a;

    invoke-static {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)Lcom/beizi/fusion/widget/dialog/dislike/a;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$a;

    invoke-static {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->b(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)Lcom/beizi/fusion/widget/dialog/dislike/a$c;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$a;

    invoke-static {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->b(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)Lcom/beizi/fusion/widget/dialog/dislike/a$c;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/fusion/widget/dialog/dislike/a$c;->a()V

    :cond_1
    return-void
.end method
