.class Lcom/join/mgps/fragment/CollectionModuleTwoFragment_$i;
.super Ljava/lang/Object;
.source "CollectionModuleTwoFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;->showMain(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment_$i;->c:Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment_$i;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment_$i;->c:Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment_$i;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;->t0(Lcom/join/mgps/fragment/CollectionModuleTwoFragment_;Ljava/util/List;)V

    return-void
.end method
