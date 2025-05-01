.class Lcom/join/mgps/fragment/MyArchiveFragment$n$d;
.super Ljava/lang/Object;
.source "MyArchiveFragment.java"

# interfaces
.implements Lcom/join/mgps/fragment/MyArchiveFragment$w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MyArchiveFragment$n;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/join/mgps/fragment/MyArchiveFragment$n;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment$n;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$n$d;->b:Lcom/join/mgps/fragment/MyArchiveFragment$n;

    iput-object p2, p0, Lcom/join/mgps/fragment/MyArchiveFragment$n$d;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/MyArchiveFragment$n$d;->b:Lcom/join/mgps/fragment/MyArchiveFragment$n;

    iget-object p2, p2, Lcom/join/mgps/fragment/MyArchiveFragment$n;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget-object p2, p2, Lcom/join/mgps/fragment/MyArchiveFragment;->I:Lcom/join/mgps/dialog/d1;

    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$n$d;->b:Lcom/join/mgps/fragment/MyArchiveFragment$n;

    iget-object p1, p1, Lcom/join/mgps/fragment/MyArchiveFragment$n;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget-object p2, p0, Lcom/join/mgps/fragment/MyArchiveFragment$n$d;->a:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/fragment/MyArchiveFragment;->u0(Ljava/util/List;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$n$d;->b:Lcom/join/mgps/fragment/MyArchiveFragment$n;

    iget-object p1, p1, Lcom/join/mgps/fragment/MyArchiveFragment$n;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo p2, "\u5907\u4efd\u5931\u8d25"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
