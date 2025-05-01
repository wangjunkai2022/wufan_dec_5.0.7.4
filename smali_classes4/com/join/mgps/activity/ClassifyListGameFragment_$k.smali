.class Lcom/join/mgps/activity/ClassifyListGameFragment_$k;
.super Ljava/lang/Object;
.source "ClassifyListGameFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ClassifyListGameFragment_;->showMain(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/ClassifyListGameFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ClassifyListGameFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ClassifyListGameFragment_$k;->c:Lcom/join/mgps/activity/ClassifyListGameFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/ClassifyListGameFragment_$k;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ClassifyListGameFragment_$k;->c:Lcom/join/mgps/activity/ClassifyListGameFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/ClassifyListGameFragment_$k;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ClassifyListGameFragment_;->B0(Lcom/join/mgps/activity/ClassifyListGameFragment_;Ljava/util/List;)V

    return-void
.end method
