.class Lcom/join/mgps/activity/MyPapaFragment_$c;
.super Ljava/lang/Object;
.source "MyPapaFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyPapaFragment_;->X(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/MyPapaFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyPapaFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyPapaFragment_$c;->c:Lcom/join/mgps/activity/MyPapaFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/MyPapaFragment_$c;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyPapaFragment_$c;->c:Lcom/join/mgps/activity/MyPapaFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/MyPapaFragment_$c;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MyPapaFragment_;->c0(Lcom/join/mgps/activity/MyPapaFragment_;Ljava/util/List;)V

    return-void
.end method
