.class Lcom/join/mgps/fragment/SearchGameListFragment_$l;
.super Ljava/lang/Object;
.source "SearchGameListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment_;->w0(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/SearchGameListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;->d:Lcom/join/mgps/fragment/SearchGameListFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;->b:Ljava/lang/String;

    iput p3, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;->d:Lcom/join/mgps/fragment/SearchGameListFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;->b:Ljava/lang/String;

    iget v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/SearchGameListFragment_;->G0(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;I)V

    return-void
.end method
