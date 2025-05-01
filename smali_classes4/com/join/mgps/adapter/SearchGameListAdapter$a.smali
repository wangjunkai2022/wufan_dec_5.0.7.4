.class Lcom/join/mgps/adapter/SearchGameListAdapter$a;
.super Lw1/p;
.source "SearchGameListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/SearchGameListAdapter;->B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GInfoBean;

.field final synthetic c:Lcom/join/mgps/dto/CommonGameInfoBean;

.field final synthetic d:Lcom/join/mgps/adapter/SearchGameListAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    iput-object p3, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {p0}, Lw1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-super {p0, p1, p2}, Lw1/p;->onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->p(Lcom/join/mgps/adapter/SearchGameListAdapter;)Landroid/content/Context;

    move-result-object v1

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getSp_tpl_two_position()I

    move-result v4

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v5

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->q(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v0 .. v9}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onClickCover()V
    .locals 11

    .line 1
    invoke-super {p0}, Lw1/p;->onClickCover()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {v1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->p(Lcom/join/mgps/adapter/SearchGameListAdapter;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->b:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getSp_tpl_two_position()I

    move-result v4

    iget-object v5, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v5

    iget-object v6, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v7}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v8}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->d:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v10, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$a;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v9, v10}, Lcom/join/mgps/adapter/SearchGameListAdapter;->q(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v0 .. v9}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
