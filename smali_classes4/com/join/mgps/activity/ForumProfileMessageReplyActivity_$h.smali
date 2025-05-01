.class Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_$h;
.super Ljava/lang/Object;
.source "ForumProfileMessageReplyActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;->Y0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_$h;->c:Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;

    iput p2, p0, Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_$h;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_$h;->c:Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;

    iget v1, p0, Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_$h;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;->G1(Lcom/join/mgps/activity/ForumProfileMessageReplyActivity_;I)V

    return-void
.end method
