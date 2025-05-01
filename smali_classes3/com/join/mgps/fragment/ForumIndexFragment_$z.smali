.class Lcom/join/mgps/fragment/ForumIndexFragment_$z;
.super Ljava/lang/Object;
.source "ForumIndexFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumIndexFragment_;->H0(ZLjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/join/mgps/fragment/ForumIndexFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumIndexFragment_;ZLjava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;->d:Lcom/join/mgps/fragment/ForumIndexFragment_;

    iput-boolean p2, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;->b:Z

    iput-object p3, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;->d:Lcom/join/mgps/fragment/ForumIndexFragment_;

    iget-boolean v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;->b:Z

    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/ForumIndexFragment_;->g1(Lcom/join/mgps/fragment/ForumIndexFragment_;ZLjava/util/List;)V

    return-void
.end method
