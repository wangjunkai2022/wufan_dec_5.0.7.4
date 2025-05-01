.class Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;
.super Ljava/lang/Object;
.source "ForumProfileFavoritesActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->s1(Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ResultMainBean;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->e:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->b:Lcom/join/mgps/dto/ResultMainBean;

    iput p3, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->c:I

    iput-object p4, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->e:Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->b:Lcom/join/mgps/dto/ResultMainBean;

    iget v2, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->c:I

    iget-object v3, p0, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$t;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->x1(Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V

    return-void
.end method
