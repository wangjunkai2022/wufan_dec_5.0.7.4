.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/adapter/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Landroidx/databinding/ViewDataBinding;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public synthetic constructor <init>(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/a;->b:Landroidx/databinding/ViewDataBinding;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/a;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/a;->b:Landroidx/databinding/ViewDataBinding;

    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/a;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {v0, v1, p1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->e(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method
