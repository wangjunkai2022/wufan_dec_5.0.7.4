.class Lcom/join/mgps/activity/PapaMainV4Fragment$d;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "PapaMainV4Fragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/PapaMainV4Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/PapaMainV4Fragment$c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/activity/PapaMainV4Fragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/PapaMainV4Fragment;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/PapaMainV4Fragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/PapaMainV4Fragment$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$d;->b:Lcom/join/mgps/activity/PapaMainV4Fragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$d;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/PapaMainV4Fragment$c;

    iget-object p1, p1, Lcom/join/mgps/activity/PapaMainV4Fragment$c;->b:Landroidx/fragment/app/Fragment;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
