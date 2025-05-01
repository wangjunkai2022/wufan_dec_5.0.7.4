.class Lcom/join/mgps/fragment/ForumIndexFragment_$c;
.super Ljava/lang/Object;
.source "ForumIndexFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumIndexFragment_;->D0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;

.field final synthetic c:Lcom/join/mgps/fragment/ForumIndexFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$c;->c:Lcom/join/mgps/fragment/ForumIndexFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$c;->b:Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$c;->c:Lcom/join/mgps/fragment/ForumIndexFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_$c;->b:Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/ForumIndexFragment_;->o1(Lcom/join/mgps/fragment/ForumIndexFragment_;Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V

    return-void
.end method
