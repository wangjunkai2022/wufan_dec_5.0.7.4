.class Lcom/join/mgps/dialog/n$a;
.super Ljava/lang/Object;
.source "ArenaRoomTypeDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/n;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/join/mgps/dialog/n;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/n;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/n$a;->c:Lcom/join/mgps/dialog/n;

    iput-object p2, p0, Lcom/join/mgps/dialog/n$a;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/n$a;->c:Lcom/join/mgps/dialog/n;

    iget-object p1, p1, Lcom/join/mgps/dialog/n;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/dialog/n$a;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/j0;->M(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
