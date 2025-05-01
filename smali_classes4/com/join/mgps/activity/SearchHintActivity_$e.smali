.class Lcom/join/mgps/activity/SearchHintActivity_$e;
.super Ljava/lang/Object;
.source "SearchHintActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity_;->i1(Lcom/join/mgps/activity/search/SearchIndexData;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/search/SearchIndexData;

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/SearchHintActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity_;Lcom/join/mgps/activity/search/SearchIndexData;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_$e;->d:Lcom/join/mgps/activity/SearchHintActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity_$e;->b:Lcom/join/mgps/activity/search/SearchIndexData;

    iput-boolean p3, p0, Lcom/join/mgps/activity/SearchHintActivity_$e;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_$e;->d:Lcom/join/mgps/activity/SearchHintActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity_$e;->b:Lcom/join/mgps/activity/search/SearchIndexData;

    iget-boolean v2, p0, Lcom/join/mgps/activity/SearchHintActivity_$e;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/SearchHintActivity_;->C1(Lcom/join/mgps/activity/SearchHintActivity_;Lcom/join/mgps/activity/search/SearchIndexData;Z)V

    return-void
.end method
