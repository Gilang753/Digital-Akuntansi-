

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Detail Pengguna</h1>
    <table class="table">
        <tr>
            <th>ID</th>
            <td><?php echo e($pengguna->id_pengguna); ?></td>
        </tr>
        <tr>
            <th>ID Pegawai</th>
            <td><?php echo e($pengguna->id_pegawai); ?></td>
        </tr>
        <tr>
            <th>Username</th>
            <td><?php echo e($pengguna->username); ?></td>
        </tr>
        <tr>
            <th>Password</th>
            <td><?php echo e($pengguna->password); ?></td>
        </tr>
    </table>
    <a href="<?php echo e(route('pengguna.index')); ?>" class="btn btn-secondary">Back</a>
</div>
<?php $__env->stopSection(); ?>

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pengguna/show.blade.php ENDPATH**/ ?>