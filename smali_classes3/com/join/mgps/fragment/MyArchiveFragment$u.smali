.class Lcom/join/mgps/fragment/MyArchiveFragment$u;
.super Landroid/content/BroadcastReceiver;
.source "MyArchiveFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/MyArchiveFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "u"
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/MyArchiveFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$u;->a:Lcom/join/mgps/fragment/MyArchiveFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$u;->a:Lcom/join/mgps/fragment/MyArchiveFragment;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->C:Z

    .line 2
    iget-object p1, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->b:Landroid/widget/RelativeLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$u;->a:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->B:Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
