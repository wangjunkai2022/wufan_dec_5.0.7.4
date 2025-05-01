.class Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;
.super Ljava/lang/Object;
.source "ForumProfileFavoritesActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->v1(Landroid/widget/AbsListView;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/AbsListView;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->f:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->b:Landroid/widget/AbsListView;

    iput p3, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->c:I

    iput p4, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->d:I

    iput p5, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->f:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->b:Landroid/widget/AbsListView;

    iget v2, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->c:I

    iget v3, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->d:I

    iget v4, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$d;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->y1(Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;Landroid/widget/AbsListView;III)V

    return-void
.end method
