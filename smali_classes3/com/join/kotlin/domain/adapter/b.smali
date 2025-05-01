.class public final synthetic Lcom/join/kotlin/domain/adapter/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;

.field public final synthetic c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/domain/adapter/b;->b:Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;

    iput-object p2, p0, Lcom/join/kotlin/domain/adapter/b;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iput p3, p0, Lcom/join/kotlin/domain/adapter/b;->d:I

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, Lcom/join/kotlin/domain/adapter/b;->b:Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;

    iget-object v1, p0, Lcom/join/kotlin/domain/adapter/b;->c:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iget v2, p0, Lcom/join/kotlin/domain/adapter/b;->d:I

    invoke-static {v0, v1, v2, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->b(Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroid/view/View;)Z

    move-result p1

    return p1
.end method
