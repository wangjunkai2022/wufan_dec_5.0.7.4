.class Lcom/join/mgps/dialog/x1$a;
.super Ljava/lang/Object;
.source "PostingSelectGameDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/x1;->c(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/x1;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/x1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/x1$a;->b:Lcom/join/mgps/dialog/x1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/x1$a;->b:Lcom/join/mgps/dialog/x1;

    invoke-static {p1}, Lcom/join/mgps/dialog/x1;->a(Lcom/join/mgps/dialog/x1;)Lcom/join/mgps/activity/posting/PostingActivity$m;

    move-result-object p1

    const/16 v0, 0x1102

    invoke-interface {p1, v0}, Lcom/join/mgps/activity/posting/PostingActivity$m;->a(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/x1$a;->b:Lcom/join/mgps/dialog/x1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/x1;->b()V

    return-void
.end method
