.class Lcom/join/mgps/activity/message/NoticeFragment_$g;
.super Ljava/lang/Object;
.source "NoticeFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/NoticeFragment_;->W(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/message/NoticeFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/NoticeFragment_$g;->c:Lcom/join/mgps/activity/message/NoticeFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/message/NoticeFragment_$g;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/NoticeFragment_$g;->c:Lcom/join/mgps/activity/message/NoticeFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/message/NoticeFragment_$g;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/message/NoticeFragment_;->k0(Lcom/join/mgps/activity/message/NoticeFragment_;Ljava/util/List;)V

    return-void
.end method
