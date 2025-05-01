.class Lcom/join/mgps/activity/SearchHintActivity_$g;
.super Ljava/lang/Object;
.source "SearchHintActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity_;->g1(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/SearchHintActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity_$g;->d:Lcom/join/mgps/activity/SearchHintActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity_$g;->b:Ljava/lang/String;

    iput p3, p0, Lcom/join/mgps/activity/SearchHintActivity_$g;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity_$g;->d:Lcom/join/mgps/activity/SearchHintActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity_$g;->b:Ljava/lang/String;

    iget v2, p0, Lcom/join/mgps/activity/SearchHintActivity_$g;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/SearchHintActivity_;->E1(Lcom/join/mgps/activity/SearchHintActivity_;Ljava/lang/String;I)V

    return-void
.end method
