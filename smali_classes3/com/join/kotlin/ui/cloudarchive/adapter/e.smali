.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/adapter/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic c:Landroidx/databinding/ViewDataBinding;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/e;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/e;->c:Landroidx/databinding/ViewDataBinding;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/e;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/e;->c:Landroidx/databinding/ViewDataBinding;

    invoke-static {v0, v1}, Lcom/join/kotlin/ui/cloudarchive/adapter/ModArchiveAdapter;->c(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/databinding/ViewDataBinding;)V

    return-void
.end method
