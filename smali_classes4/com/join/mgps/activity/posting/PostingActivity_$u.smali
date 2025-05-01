.class Lcom/join/mgps/activity/posting/PostingActivity_$u;
.super Ljava/lang/Object;
.source "PostingActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/posting/PostingActivity_;->a1(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/posting/PostingActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/posting/PostingActivity_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/posting/PostingActivity_$u;->c:Lcom/join/mgps/activity/posting/PostingActivity_;

    iput p2, p0, Lcom/join/mgps/activity/posting/PostingActivity_$u;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity_$u;->c:Lcom/join/mgps/activity/posting/PostingActivity_;

    iget v1, p0, Lcom/join/mgps/activity/posting/PostingActivity_$u;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/posting/PostingActivity_;->o1(Lcom/join/mgps/activity/posting/PostingActivity_;I)V

    return-void
.end method
