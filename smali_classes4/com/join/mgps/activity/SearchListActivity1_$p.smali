.class Lcom/join/mgps/activity/SearchListActivity1_$p;
.super Ljava/lang/Object;
.source "SearchListActivity1_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchListActivity1_;->Q0(Lcom/join/mgps/dto/SearchGameListBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SearchGameListBean;

.field final synthetic c:Lcom/join/mgps/activity/SearchListActivity1_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchListActivity1_;Lcom/join/mgps/dto/SearchGameListBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1_$p;->c:Lcom/join/mgps/activity/SearchListActivity1_;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1_$p;->b:Lcom/join/mgps/dto/SearchGameListBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_$p;->c:Lcom/join/mgps/activity/SearchListActivity1_;

    iget-object v1, p0, Lcom/join/mgps/activity/SearchListActivity1_$p;->b:Lcom/join/mgps/dto/SearchGameListBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/SearchListActivity1_;->U0(Lcom/join/mgps/activity/SearchListActivity1_;Lcom/join/mgps/dto/SearchGameListBean;)V

    return-void
.end method
