.class Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;
.super Lw1/p;
.source "FindMiniGameFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;->j(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonGameInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CommonGameInfoBean;

.field final synthetic c:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->c:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    iput-object p2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {p0}, Lw1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lw1/p;->onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    const/16 p2, 0x96

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->c:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    iget-object p2, p2, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;->d:Lcom/join/mgps/fragment/FindMiniGameFragment;

    iget-object p2, p2, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public onClickCover()V
    .locals 3

    .line 1
    invoke-super {p0}, Lw1/p;->onClickCover()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->c:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    iget-object v1, v1, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;->d:Lcom/join/mgps/fragment/FindMiniGameFragment;

    iget-object v1, v1, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter$a;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
