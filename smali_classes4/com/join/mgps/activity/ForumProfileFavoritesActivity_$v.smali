.class Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;
.super Ljava/lang/Object;
.source "ForumProfileFavoritesActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->I0(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;->d:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;

    iput p2, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;->b:I

    iput-boolean p3, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;->d:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;

    iget v1, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;->b:I

    iget-boolean v2, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$v;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->K1(Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;IZ)V

    return-void
.end method
