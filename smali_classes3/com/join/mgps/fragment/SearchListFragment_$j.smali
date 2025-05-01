.class Lcom/join/mgps/fragment/SearchListFragment_$j;
.super Ljava/lang/Object;
.source "SearchListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchListFragment_;->o0(Lcom/join/mgps/dto/SearchIntegratedBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SearchIntegratedBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/SearchListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchIntegratedBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment_$j;->d:Lcom/join/mgps/fragment/SearchListFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/SearchListFragment_$j;->b:Lcom/join/mgps/dto/SearchIntegratedBean;

    iput p3, p0, Lcom/join/mgps/fragment/SearchListFragment_$j;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_$j;->d:Lcom/join/mgps/fragment/SearchListFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchListFragment_$j;->b:Lcom/join/mgps/dto/SearchIntegratedBean;

    iget v2, p0, Lcom/join/mgps/fragment/SearchListFragment_$j;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/SearchListFragment_;->z0(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchIntegratedBean;I)V

    return-void
.end method
