.class Lcom/join/mgps/activity/ForumPostsActivity_$x0;
.super Lorg/androidannotations/api/a$c;
.source "ForumPostsActivity_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumPostsActivity_;->R1(Landroid/widget/ListView;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/ListView;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lcom/join/mgps/activity/ForumPostsActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;Landroid/widget/ListView;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->f:Lcom/join/mgps/activity/ForumPostsActivity_;

    iput-object p6, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->b:Landroid/widget/ListView;

    iput p7, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->c:I

    iput p8, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->d:I

    iput p9, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->e:I

    invoke-direct {p0, p2, p3, p4, p5}, Lorg/androidannotations/api/a$c;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->f:Lcom/join/mgps/activity/ForumPostsActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->b:Landroid/widget/ListView;

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->c:I

    iget v3, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->d:I

    iget v4, p0, Lcom/join/mgps/activity/ForumPostsActivity_$x0;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/activity/ForumPostsActivity_;->L3(Lcom/join/mgps/activity/ForumPostsActivity_;Landroid/widget/ListView;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
