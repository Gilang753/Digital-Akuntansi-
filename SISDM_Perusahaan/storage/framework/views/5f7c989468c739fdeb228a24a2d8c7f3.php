

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Edit Pengguna</h1>
    <form action="<?php echo e(route('pengguna.update', $pengguna->id_pengguna)); ?>" method="POST">
        <?php echo csrf_field(); ?>
        <?php echo method_field('PUT'); ?>
        <div class="form-group">
            <label for="id_pegawai">ID Pegawai:</label>
            <input type="text" class="form-control" id="id_pegawai" name="id_pegawai" value="<?php echo e($pengguna->id_pegawai); ?>" required>
        </div>
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" class="form-control" id="username" name="username" value="<?php echo e($pengguna->username); ?>" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" name="password" value="<?php echo e($pengguna->password); ?>" required>
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
    </form>
</div>
<?php $__env->stopSection(); ?>

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pengguna/edit.blade.php ENDPATH**/ ?>